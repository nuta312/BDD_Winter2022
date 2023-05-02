package step_defs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.List;

public class DataTableDemo_steps {


    @Given("fill up fullName with following fullname")
    public void fill_up_full_name_with_following_fullname(DataTable userNames) {
        List<List<String>> data = userNames.asLists(String.class);
        String lebron2 = data.get(2).get(0);
        System.out.println(lebron2);
    }

    @Given("fill up age with")
    public void fill_up_age_with(DataTable dataTable) {

    }
    @Given("fill up email with")
    public void fill_up_email_with(DataTable dataTable) {

    }
}
