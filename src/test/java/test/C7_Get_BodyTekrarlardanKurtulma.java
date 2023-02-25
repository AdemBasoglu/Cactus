package test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;


public class C7_Get_BodyTekrarlardanKurtulma {
    //C7_Get_BodyTekrarlardanKurtulma

    /*https://restful-booker.herokuapp.com/booking/10 url’ine bir GET request gonderdigimizde donen Response’un,
 	status code’unun 200,
        ve content type’inin application-json,
	    ve response body’sindeki
		"firstname": "Mark",
    "lastname": "Smith",
    "totalprice": 856,
    "depositpaid": true,
    "additionalneeds": "Breakfast"
oldugunu test edin
*/
    @Test
    public void c7_Get_BodyTekrarlardanKurtulma() {

        //1- url ve body hazirla

        String url = "https://restful-booker.herokuapp.com/booking/10";
        // 2 - Eger soruda bize verilmisse Expected Data hazirla


        // 3 - Bize donen Response'i Actual Data olarak kaydet
        Response response= given().when().get(url);
        response.prettyPrint();
        System.out.println(response.contentType());


        // 4 - Assertion

        response.
                then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON).
                body("firstname", equalTo("Eric"),
                        "lastname",equalTo("Jackson"),
                        "totalprice", equalTo(516),
                        "depositpaid", equalTo(false));
        //"additionalneeds", equalTo("Breakfast"));
    }





}
