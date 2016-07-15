<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Record Flight</title>
        <link href="resources/style.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <form:form commandName="flight" action="recordFlight" method="post">
            <form:errors path="*" cssClass="errorblock" element="div" />
            <table>
 
                <tr>
                    <td># of Takeoffs :</td>
                    <td><form:input path="numberOfTakeOffs" /> </td>
                    <td><form:errors path="numberOfTakeOffs" cssClass="error"/> </td>
                </tr>
                <tr>
                    <td># of landings:</td>
                    <td><form:input path="numberOfLandings" /> </td>
                    <td><form:errors path="numberOfLandings" cssClass="error" /> </td>
                </tr>
            </table>
            <input type="submit" value="Save Flight"/>

        </form:form>
    </body>
</html>