<%--
  Created by IntelliJ IDEA.
  User: lyCui
  Date: 2018/10/2
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Demo1</title>
    <script type="text/javascript">
        window.onload = function (ev) {
            /*var set = new Set(["aa","bb","cc"]);
            set.add("dd");
            set.add("dd");
            set.delete("bb");
            set.forEach(function(value,thisvalue,set) {
                alert(value);
            });*/
           /* var map = new Map([[1,"abc"],[2,"def"],[3,"ghi"]]);
            map.set("jkl",4);
            map.set(3,"aaa");
            map.forEach(function (value,key,map) {
                alert(key+" "+value);
            });
            alert(map.get(3));*/
            var array = new Array("albert", "Choosl", "Chow", "Anne", "Gale");
            array.push("hahah");
            array.unshift("first");
           /* var result = "";
            for (var i = 0; i < array.length; i++) {
                result += array[i];
            }*/
                //alert(result);
            document.write(array.toString()," ",array.toLocaleString()," ",array.join("-")," ",array.pop()," ",array.join("|"));
            /* array.forEach(function(value, index, array){
                 result += value+" "+this.name;
             },new person("崔璐瑶",21,'X'));
             alert(result);*/
            /* var brother = new person("弟弟",1,'x');
             brother.changeName("哥哥");
              for (var x in brother) {
                  alert(brother[x]);
              }*/

            /*var city = "我爱人民";
                for(word of city) {
                    alert(word);
                }
            }*/
            function person(name, age, sex) {
                this.name = name;
                this.age = age;
                this.sex = sex;
                this.changeName = changeName;

                function changeName(name) {
                    this.name = name;
                }
            }
        }
    </script>
</head>
<body>
<strong>欢迎来到demo1</strong>
</body>
</html>
