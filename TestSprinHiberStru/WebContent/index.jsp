<%--
    Licensed to the Apache Software Foundation (ASF) under one or more
    contributor license agreements.  See the NOTICE file distributed with
    this work for additional information regarding copyright ownership.
    The ASF licenses this file to You under the Apache License, Version 2.0
    (the "License"); you may not use this file except in compliance with
    the License.  You may obtain a copy of the License at
   
         http://www.apache.org/licenses/LICENSE-2.0
   
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
--%>
<form action="titi.do" method="post">
Nom :<input type="text" name="nom"></br></br>
Age :<input type="text" name="prenom"></br></br>
Adress:</br></br>
Num :<input type="text" name="num"></br></br>
Rue :<input type="text" name="rue"></br></br>
Code Postal :<input type="text" name="codepostal"></br></br>
Ville :<input type="text" name="ville"></br></br>
Pays :<input type="text" name="pays"></br></br>

<a href="toto.do">Voir les Personne</a></br></br>
<input type="submit" value="Ajouter">
</form>

<%--

Redirect default requests to Welcome global ActionForward.
By using a redirect, the user-agent will change address to match the path of our Welcome ActionForward. 

--%>
