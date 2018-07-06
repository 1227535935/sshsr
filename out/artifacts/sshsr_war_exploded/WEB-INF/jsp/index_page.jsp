<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<script src="<%=request.getContextPath()%>/WEB-INF/js/jquery-1.8.2.js"></script>--%>
<script type="text/javascript">
    function doSubmit() {
        console.info(111);
        document.getElementById("form1").submit();
    }
</script>
<form id="form1" action="/sshsr/login" method="post" enctype="multipart/form-data">
    账号：<input type="text" name="account" value="坚果">
    密码：<input type="password" name="psd" value="麦片">
    文件：<input type="file" name="uploadFile">
</form>
<input type="submit" value="水果" onclick="doSubmit()">
</body>
</html>
