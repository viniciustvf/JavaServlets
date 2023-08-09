<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
	<body>
	
		<c:if test="${not empty empresa}">
			Empresa ${ empresa }, Fundada em <fmt:formatDate value="${ data }" pattern="dd/MM/yyyy"/> cadastrada com sucesso!
		</c:if>
		<c:if test="${empty empresa}">
			Nenhuma empresa cadastrada!
		</c:if>

	</body>
</html>
