<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>                                   //utf-8即兼容中文
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
@import url("*.css");
body{font-family: "宋体";       //设置文本字体类型：宋体
font-size: 14px;              //文本字体大小：14像素
text-align: center;       //文本居中
margin:0;                 // 外边距为0
}
#wrap{
            width:75%;        // 页面宽度
            margin:0;
            }
#head{                                  //对图片的设置
             width:100%;
             height:120px;                
             font-family:"方正舒体";
             font-size:48px;
             font-style:oblique;
             line-height:120px;
             color:#D5D5D5
             }
#nav{                                    //对导航栏的设置                       
          width:100%;
          height:40px;
          background-color:#CCC;
          padding-top:20px;
          text-align:center;
          }
          li{
               display:inline;
               padding:5px;
               align:center
               }
#content{                                   //对登录表单的设置
                  float:right;
                  width:100%;
                  padding-top:10px;
                  height:400px;
                  }
#foot{                                    //对底部的设置
           clear:both;
           height:40px;
           width:100%;
           background-color:#CCC;
           padding-top:10px;
           }
</style>
</head>
<body>
<div id="wrap">
  <div id="head"><img src="C:\Users\A29\workspace\bbs07\WebContent\image/Desert.jpg" width="100%" height="120px">      //图片的路径以及图片要自己找，尽量必要用中文名
  </div>
    <div id="nav" >
      <ul >
      <div align="right">
      <li><a href="index.jsp">首页</a></li>          
       <li><a href="login.jsp">登陆</a></li>                //此处超链接并没有，可以更换名字，具体以要连接网页为名
       <li><a href="exit.jsp">退出</a></li>                //此处超链接并没有，可以更换名字，具体以要连接网页为名
       <li><a href="reg.jsp">注册</a></li>                 //此处超链接并没有，可以更换名字，具体以要连接网页为名
       <li><a href="mailto:neujspbook@yeah.net">与我联系</a></li>
        </div>
        </ul>
      </div>
<div id="content">  
<form id="form" name="form1" method="post" action="">              //form只能有一个，不能出现多个嵌套
<tr><td>
    <p><strong>登录</strong></p>
     <p>&nbsp;</p>                                                //&nbsp;是空格
</td></tr>
<tr>
    <td>用户名*</td>&nbsp;&nbsp;&nbsp;
    <td><input type="Text" name="PID" value="" size="20" maxlength="18">&nbsp;&nbsp;长度要求为3-20个字符</td>
</tr>
<tr>
 <td>密 码*</td>&nbsp;&nbsp;&nbsp;
 <td><input type="password" name="PID" value=""  size="20" maxlength="18">&nbsp;&nbsp;长度要求为3-20个字符</td>
</tr>
<tr>
<td>保存期限</td>&nbsp;&nbsp;
<td>
 <INPUT NAME=”sex” TYPE=radio VALUE=”male”>不保存       //name要记得更改
 <INPUT TYPE=radio NAME=”sex” VALUE=”male”>一个月       //name要记得更改
  <INPUT TYPE=radio NAME=”sex” VALUE=”male”>半年        //name要记得更改
  在指定期限内可自动登录
  </td>
</tr>
<tr>
<td>
<input type="submit" name="button" id="button" value="提交" />
 <input type="submit" name="button2" id="button2" value="重置" />
</td>
</tr>
 </form>
</div>
<div id="foot">
学习案例———《JSP实用教程》编写组
</div>  
</body>
</html>