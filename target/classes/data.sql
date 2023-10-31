1. Second highest salary

SELECT DISTINCT Salary FROM Employee ORDER BY Salary DESC LIMIT 1 OFFSET 1;

2. To find all duplicate names in a table along with their counts

SELECT Name, COUNT(*) AS Count FROM Employees GROUP BY Name HAVING COUNT(*) > 1;

3. To retrieve the employee ID, employee name, and their manager's name from an Employee table.

SELECT E.id AS EmployeeID, E.name AS EmployeeName, M.name AS ManagerName
FROM Employee E LEFT JOIN Employee M ON E.manager_id = M.id;


