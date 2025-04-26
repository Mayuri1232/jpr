import java.awt.*;

public class BasicBiodataForm extends Frame {
    BasicBiodataForm() {
        // Frame settings
        setTitle("Bio-data Form");
        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        // Name
        Label nameLabel = new Label("Name:");
        nameLabel.setBounds(50, 50, 60, 20);
        add(nameLabel);

        TextField nameField = new TextField();
        nameField.setBounds(120, 50, 200, 20);
        add(nameField);

        // Gender
        Label genderLabel = new Label("Gender:");
        genderLabel.setBounds(50, 90, 60, 20);
        add(genderLabel);

        CheckboxGroup genderGroup = new CheckboxGroup();
        Checkbox male = new Checkbox("Male", genderGroup, false);
        male.setBounds(120, 90, 60, 20);
        add(male);

        Checkbox female = new Checkbox("Female", genderGroup, false);
        female.setBounds(190, 90, 70, 20);
        add(female);

        // Hobbies
        Label hobbiesLabel = new Label("Hobbies:");
        hobbiesLabel.setBounds(50, 130, 60, 20);
        add(hobbiesLabel);

        Checkbox hobbyReading = new Checkbox("Reading");
        hobbyReading.setBounds(120, 130, 80, 20);
        add(hobbyReading);

        Checkbox hobbyTraveling = new Checkbox("Traveling");
        hobbyTraveling.setBounds(200, 130, 80, 20);
        add(hobbyTraveling);

        Checkbox hobbyMusic = new Checkbox("Music");
        hobbyMusic.setBounds(280, 130, 60, 20);
        add(hobbyMusic);

        // Address
        Label addressLabel = new Label("Address:");
        addressLabel.setBounds(50, 170, 60, 20);
        add(addressLabel);

        TextArea addressArea = new TextArea();
        addressArea.setBounds(120, 170, 200, 60);
        add(addressArea);

        // Submit Button
        Button submitButton = new Button("Submit");
        submitButton.setBounds(150, 250, 80, 30);
        add(submitButton);
    }

    public static void main(String[] args) {
        new BasicBiodataForm();
    }
}
