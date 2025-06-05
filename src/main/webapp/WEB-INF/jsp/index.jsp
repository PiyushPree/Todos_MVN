<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>My Todos</title>
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
    <div class="jumbotron text-center">
      <h1>My Todos List in MVC</h1>
      <p>Resize this responsive page to see the effect!</p>
    </div>

    <div class="container">
      <div class="row">
        <div class="col-sm-4">
        </div>
        <div class="col-sm-4">
          <h3>Todos</h3>
          <form method="post" action="/btn">
                Id:<input type = "number" name = "id" class="form-control"/>
                Title: <input type="text" name="title" class="form-control" />
                Description: <input type="text" name="description" class="form-control" />
                Priorities : <select class="form-control form-select form-select-sm" aria-label=".form-select-sm example" name = "priority">
                               <option selected>select Priorities</option>
                               <option value="HIGH">High</option>
                               <option value="MEDIUM">Medium</option>
                               <option value="LOW">Low</option>
                             </select>
                <br/>

                <input name="add" type="submit" value="Add" class="btn btn-success" />
                <input name="update" type="submit" value="Update" class="btn btn-warning" />
                </br>

          </form>
        </div>
        <div class="col-sm-4">
        </div>
      </div>
    </div>
    <div class = "row">
            <div class="col-sm-2"></div>
            <div class="col-sm-8">
                    <table class="table table-bordered table table-hover table-striped">
                    <thead>
                           <th>Id</th><th>Title</th><th>Description</th><th>Delete</th>
                    </thead>
                    <tbody>
                        <c:forEach var="p" items="${todos}">
                        <tr>
                              <td>${p.id}</td>
                              <td>${p.title}</td>
                              <td>${p.priority}</td>
                              <td>${p.description}</td>
                             <td>
                                 <form method="post" action="/btn">
                                     <input type="hidden" name="id" value="${p.id}" />
                                     <input name="delete" type="submit" value="Delete" class="btn btn-danger" />
                                 </form>
                             </td>

                        </tr>
                        </c:forEach>
                    </tbody>
                    </table>
            </div>
            <div class="col-sm-2"></div>

    </div>
</body>
</html>
