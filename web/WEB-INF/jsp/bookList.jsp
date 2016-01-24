<%@include file="includes/header.jsp" %>
<c:if test="${not empty books}">
<table class="table table-bordered">
    
    <thead>
      <tr  class="success">
        <th>Id</th>
        <th>Title</th>
        <th>Author</th>
        <th>ISBN</th>
        <th>Price</th>
        <th>Edit</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var="booklists" items="${books}">
    
      <tr>
        <td>${booklists.id}</td>
        <td>${booklists.title}</td>
        <td>${booklists.author}</td>
         <td>${booklists.isbn}</td>
        <td>${booklists.price}</td>
        <td> <a href="AddBook?${booklists.id}" class="btn btn-info" role="button">Link Button</a></td>
      </tr>
    </c:forEach>
      </tbody>
  </table>
</c:if>