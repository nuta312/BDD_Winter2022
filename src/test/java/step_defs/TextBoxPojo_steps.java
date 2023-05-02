package step_defs;

import com.spacex.models.TextBoxModel;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class TextBoxPojo_steps {

    @DataTableType
    public TextBoxModel transform(Map<String, String> entry) {
        return new TextBoxModel(
                entry.get("fullName"),
                entry.get("email"),
                entry.get("currentAddress"),
                entry.get("permanentAddress")
        );
    }


    @Given("user is on Text box page")
    public void user_is_on_text_box_page() {

    }
    @Given("fill up all fields with following data")
    public void fill_up_all_fields_with_following_data(List<TextBoxModel> data) {
        for (TextBoxModel e:data) {
            System.out.println(e.getFullName());
        }
        System.out.println(data.get(0).getEmail());
    }
}
