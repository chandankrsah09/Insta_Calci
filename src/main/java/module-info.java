module com.example.instacalci {
	requires javafx.controls;
	requires javafx.fxml;


	opens com.instacalci to javafx.fxml;
	exports com.instacalci;
}