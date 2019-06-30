select Request_at as Day,(round(count(if(status != 'completed', status, null)) / count(status), 2)) as 'Cancellation Rate' from Trips  join Users on Client_Id = Users_Id  where Request_at between '2013-10-01' and '2013-10-03'   and Role = 'client' and Banned='No' group by Request_at