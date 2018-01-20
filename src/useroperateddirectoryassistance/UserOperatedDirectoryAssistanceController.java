/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useroperateddirectoryassistance;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author mytree
 */
public class UserOperatedDirectoryAssistanceController {

    @FXML
    private Label label;
    @FXML
    private Button btnTwo;
    @FXML
    private Button btnThree;
    @FXML
    private Button btnFour;
    @FXML
    private Button btnFive;
    @FXML
    private Button btnSix;
    @FXML
    private Button btnSeven;
    @FXML
    private Button btnEight;
    @FXML
    private Button btnNine;
    @FXML
    private Button btnNewLookUp;
    @FXML
    private TextField txtPushButton;
    @FXML
    private TextArea outputScreen;

    @FXML
    public void initialize() {

        btnTwo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                onTwoClicked();    // Always call a method in the outer class
            }
        });
        btnThree.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                onThreeClicked();    // Always call a method in the outer class
            }
        });
        btnFour.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                onFourClicked();    // Always call a method in the outer class
            }
        });
        btnFive.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                onFiveClicked();    // Always call a method in the outer class
            }
        });
        btnSix.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                onSixClicked();    // Always call a method in the outer class
            }
        });
        btnSeven.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                onSevenClicked();    // Always call a method in the outer class
            }
        });
        btnEight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                onEightClicked();    // Always call a method in the outer class
            }
        });
        btnNine.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                onNineClicked();    // Always call a method in the outer class
            }
        });
        btnNewLookUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                onNewLookUpClicked();    // Always call a method in the outer class
            }
        });
    }

    String jHendrix = "4365";
    String rRhoads = "7467";
    String dDarrell = "3273";

    public void onTwoClicked() {
        if (txtPushButton.getText().length() == 4) {
            Scanner reader = null;
            ArrayList<String> employeeList = new ArrayList();

            try {
                File fileDescriptor = new File("Employee.txt");
                reader = new Scanner(fileDescriptor);
                while (reader.hasNext()) {
                    String record = reader.nextLine();
                    String[] fields = record.split(" ");

                    if (fields.length >= 3) {
                        Employee r1 = new Employee(fields[0], fields[1], fields[2]);
                        employeeList.add(r1.getFirstName());
                        employeeList.add(r1.getLastName());
                        employeeList.add(r1.getExtension());

                    }

                }

                if (txtPushButton.getText().equals(jHendrix)) {
                    outputScreen.appendText(employeeList.get(0) + " " + employeeList.get(1) + " " + employeeList.get(2));
                } else if (txtPushButton.getText().equals(rRhoads)) {
                    outputScreen.appendText(employeeList.get(3) + " " + employeeList.get(4) + " " + employeeList.get(5));
                } else if (txtPushButton.getText().equals(dDarrell)) {
                    outputScreen.appendText(employeeList.get(6) + " " + employeeList.get(7) + " " + employeeList.get(8));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace(); // Add error recovery here
            } finally {
                if (reader != null) {
                    reader.close();
                }
            }

        } else {
            txtPushButton.setText(txtPushButton.getText() + "2");
        }

    }

    public void onThreeClicked() {
        if (txtPushButton.getText().length() == 4) {
            Scanner reader = null;
            ArrayList<String> employeeList = new ArrayList();

            try {
                File fileDescriptor = new File("Employee.txt");
                reader = new Scanner(fileDescriptor);
                while (reader.hasNext()) {
                    String record = reader.nextLine();
                    String[] fields = record.split(" ");

                    if (fields.length >= 3) {
                        Employee r1 = new Employee(fields[0], fields[1], fields[2]);
                        employeeList.add(r1.getFirstName());
                        employeeList.add(r1.getLastName());
                        employeeList.add(r1.getExtension());

                    }

                }

                if (txtPushButton.getText().equals(jHendrix)) {
                    outputScreen.appendText(employeeList.get(0) + " " + employeeList.get(1) + " " + employeeList.get(2));
                } else if (txtPushButton.getText().equals(rRhoads)) {
                    outputScreen.appendText(employeeList.get(3) + " " + employeeList.get(4) + " " + employeeList.get(5));
                } else if (txtPushButton.getText().equals(dDarrell)) {
                    outputScreen.appendText(employeeList.get(6) + " " + employeeList.get(7) + " " + employeeList.get(8));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace(); // Add error recovery here
            } finally {
                if (reader != null) {
                    reader.close();
                }
            }

        } else {
            txtPushButton.setText(txtPushButton.getText() + "3");
        }

    }

    public void onFourClicked() {
        if (txtPushButton.getText().length() == 4) {
            Scanner reader = null;
            ArrayList<String> employeeList = new ArrayList();

            try {
                File fileDescriptor = new File("Employee.txt");
                reader = new Scanner(fileDescriptor);
                while (reader.hasNext()) {
                    String record = reader.nextLine();
                    String[] fields = record.split(" ");

                    if (fields.length >= 3) {
                        Employee r1 = new Employee(fields[0], fields[1], fields[2]);
                        employeeList.add(r1.getFirstName());
                        employeeList.add(r1.getLastName());
                        employeeList.add(r1.getExtension());

                    }

                }

                if (txtPushButton.getText().equals(jHendrix)) {
                    outputScreen.appendText(employeeList.get(0) + " " + employeeList.get(1) + " " + employeeList.get(2));
                } else if (txtPushButton.getText().equals(rRhoads)) {
                    outputScreen.appendText(employeeList.get(3) + " " + employeeList.get(4) + " " + employeeList.get(5));
                } else if (txtPushButton.getText().equals(dDarrell)) {
                    outputScreen.appendText(employeeList.get(6) + " " + employeeList.get(7) + " " + employeeList.get(8));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace(); // Add error recovery here
            } finally {
                if (reader != null) {
                    reader.close();
                }
            }

        } else {
            txtPushButton.setText(txtPushButton.getText() + "4");
        }

    }

    public void onFiveClicked() {
        if (txtPushButton.getText().length() == 4) {
            Scanner reader = null;
            ArrayList<String> employeeList = new ArrayList();

            try {
                File fileDescriptor = new File("Employee.txt");
                reader = new Scanner(fileDescriptor);
                while (reader.hasNext()) {
                    String record = reader.nextLine();
                    String[] fields = record.split(" ");

                    if (fields.length >= 3) {
                        Employee r1 = new Employee(fields[0], fields[1], fields[2]);
                        employeeList.add(r1.getFirstName());
                        employeeList.add(r1.getLastName());
                        employeeList.add(r1.getExtension());

                    }

                }

                if (txtPushButton.getText().equals(jHendrix)) {
                    outputScreen.appendText(employeeList.get(0) + " " + employeeList.get(1) + " " + employeeList.get(2));
                } else if (txtPushButton.getText().equals(rRhoads)) {
                    outputScreen.appendText(employeeList.get(3) + " " + employeeList.get(4) + " " + employeeList.get(5));
                } else if (txtPushButton.getText().equals(dDarrell)) {
                    outputScreen.appendText(employeeList.get(6) + " " + employeeList.get(7) + " " + employeeList.get(8));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace(); // Add error recovery here
            } finally {
                if (reader != null) {
                    reader.close();
                }
            }

        } else {
            txtPushButton.setText(txtPushButton.getText() + "5");
        }

    }

    public void onSixClicked() {
        if (txtPushButton.getText().length() == 4) {
            Scanner reader = null;
            ArrayList<String> employeeList = new ArrayList();

            try {
                File fileDescriptor = new File("Employee.txt");
                reader = new Scanner(fileDescriptor);
                while (reader.hasNext()) {
                    String record = reader.nextLine();
                    String[] fields = record.split(" ");

                    if (fields.length >= 3) {
                        Employee r1 = new Employee(fields[0], fields[1], fields[2]);
                        employeeList.add(r1.getFirstName());
                        employeeList.add(r1.getLastName());
                        employeeList.add(r1.getExtension());

                    }

                }

                 if (txtPushButton.getText().equals(jHendrix)) {
                    outputScreen.appendText(employeeList.get(0) + " " + employeeList.get(1) + " " + employeeList.get(2));
                } else if (txtPushButton.getText().equals(rRhoads)) {
                    outputScreen.appendText(employeeList.get(3) + " " + employeeList.get(4) + " " + employeeList.get(5));
                } else if (txtPushButton.getText().equals(dDarrell)) {
                    outputScreen.appendText(employeeList.get(6) + " " + employeeList.get(7) + " " + employeeList.get(8));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace(); // Add error recovery here
            } finally {
                if (reader != null) {
                    reader.close();
                }
            }

        } else {
            txtPushButton.setText(txtPushButton.getText() + "6");
        }

    }

    public void onSevenClicked() {
        if (txtPushButton.getText().length() == 4) {
            Scanner reader = null;
            ArrayList<String> employeeList = new ArrayList();

            try {
                File fileDescriptor = new File("Employee.txt");
                reader = new Scanner(fileDescriptor);
                while (reader.hasNext()) {
                    String record = reader.nextLine();
                    String[] fields = record.split(" ");

                    if (fields.length >= 3) {
                        Employee r1 = new Employee(fields[0], fields[1], fields[2]);
                        employeeList.add(r1.getFirstName());
                        employeeList.add(r1.getLastName());
                        employeeList.add(r1.getExtension());

                    }

                }

               if (txtPushButton.getText().equals(jHendrix)) {
                    outputScreen.appendText(employeeList.get(0) + " " + employeeList.get(1) + " " + employeeList.get(2));
                } else if (txtPushButton.getText().equals(rRhoads)) {
                    outputScreen.appendText(employeeList.get(3) + " " + employeeList.get(4) + " " + employeeList.get(5));
                } else if (txtPushButton.getText().equals(dDarrell)) {
                    outputScreen.appendText(employeeList.get(6) + " " + employeeList.get(7) + " " + employeeList.get(8));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace(); // Add error recovery here
            } finally {
                if (reader != null) {
                    reader.close();
                }
            }

        } else {
            txtPushButton.setText(txtPushButton.getText() + "7");
        }

    }

    public void onEightClicked() {
        if (txtPushButton.getText().length() == 4) {
            Scanner reader = null;
            ArrayList<String> employeeList = new ArrayList();

            try {
                File fileDescriptor = new File("Employee.txt");
                reader = new Scanner(fileDescriptor);
                while (reader.hasNext()) {
                    String record = reader.nextLine();
                    String[] fields = record.split(" ");

                    if (fields.length >= 3) {
                        Employee r1 = new Employee(fields[0], fields[1], fields[2]);
                        employeeList.add(r1.getFirstName());
                        employeeList.add(r1.getLastName());
                        employeeList.add(r1.getExtension());

                    }

                }

                if (txtPushButton.getText().equals(jHendrix)) {
                    outputScreen.appendText(employeeList.get(0) + " " + employeeList.get(1) + " " + employeeList.get(2));
                } else if (txtPushButton.getText().equals(rRhoads)) {
                    outputScreen.appendText(employeeList.get(3) + " " + employeeList.get(4) + " " + employeeList.get(5));
                } else if (txtPushButton.getText().equals(dDarrell)) {
                    outputScreen.appendText(employeeList.get(6) + " " + employeeList.get(7) + " " + employeeList.get(8));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace(); // Add error recovery here
            } finally {
                if (reader != null) {
                    reader.close();
                }
            }

        } else {
            txtPushButton.setText(txtPushButton.getText() + "8");
        }

    }

    public void onNineClicked() {
        if (txtPushButton.getText().length() == 4) {
            Scanner reader = null;
            ArrayList<String> employeeList = new ArrayList();

            try {
                File fileDescriptor = new File("Employee.txt");
                reader = new Scanner(fileDescriptor);
                while (reader.hasNext()) {
                    String record = reader.nextLine();
                    String[] fields = record.split(" ");

                    if (fields.length >= 3) {
                        Employee r1 = new Employee(fields[0], fields[1], fields[2]);
                        employeeList.add(r1.getFirstName());
                        employeeList.add(r1.getLastName());
                        employeeList.add(r1.getExtension());

                    }

                }

              if (txtPushButton.getText().equals(jHendrix)) {
                    outputScreen.appendText(employeeList.get(0) + " " + employeeList.get(1) + " " + employeeList.get(2));
                } else if (txtPushButton.getText().equals(rRhoads)) {
                    outputScreen.appendText(employeeList.get(3) + " " + employeeList.get(4) + " " + employeeList.get(5));
                } else if (txtPushButton.getText().equals(dDarrell)) {
                    outputScreen.appendText(employeeList.get(6) + " " + employeeList.get(7) + " " + employeeList.get(8));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace(); // Add error recovery here
            } finally {
                if (reader != null) {
                    reader.close();
                }
            }

        } else {
            txtPushButton.setText(txtPushButton.getText() + "9");
        }

    }

    public void onNewLookUpClicked() {
        outputScreen.setText("");
        txtPushButton.setText("");
    }

}
