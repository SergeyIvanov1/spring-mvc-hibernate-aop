<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>All students</h2>

<br>
<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Operations</th>
    </tr>

    <c:forEach var="student" items="${allStudents}">

        <c:url var="updateButton" value="/updateInfo">
            <c:param name="studentId" value="${student.id}"/>

        </c:url>

        <c:url var="deleteButton" value="/deleteStudent">
            <c:param name="studentId" value="${student.id}"/>

        </c:url>

        <tr>
            <td>${student.name}</td>
            <td>${student.surname}</td>
            <td>${student.department}</td>
            <td>${student.salary}</td>
            <td>
                <input type="button" value="Update"
                       onclick="window.location.href = '${updateButton}'"/>

                <input type="button" value="Delete"
                       onclick="window.location.href = '${deleteButton}'"/>
            </td>
        </tr>
    </c:forEach>
</table>

<br>
<input type="button"
       value="Add"
       onclick="window.location.href = '/addNewStudent'"/>

</body>
</html>
