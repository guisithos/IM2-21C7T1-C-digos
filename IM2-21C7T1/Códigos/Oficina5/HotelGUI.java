package com.br.dell.hotelgui;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.Window;

public class HotelGUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Sistema de Hotel | DELL-Lead");

        GridPane gridPane = painelDeRegistro();
        addUIControls(gridPane);
        Scene scene = new Scene(gridPane, 600, 400);
        primaryStage.setScene(scene);

        primaryStage.show();
    }


    private GridPane painelDeRegistro() {

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(10, 45, 10, 5));

        //Gaps
        gridPane.setHgap(8);
        gridPane.setVgap(8);
        return gridPane;
    }

    private void addUIControls(GridPane gridPane) {
        // Cabeçalho
        Label headerLabel = new Label("Registro de Hóspede");
        gridPane.add(headerLabel, 0,0,2,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));

        // Campo e Label de nome
        Label rotuloNome = new Label("Nome: ");
        gridPane.add(rotuloNome, 0,1);

        TextField campoNome = new TextField();
        campoNome.setPrefHeight(35);
        gridPane.add(campoNome, 1,1);

        // Campo e Label de endereço
        Label rotuloEndereco = new Label("Endereço: ");
        gridPane.add(rotuloEndereco, 0, 2);

        TextField campoEndereco = new TextField();
        campoEndereco.setPrefHeight(35);
        gridPane.add(campoEndereco, 1, 2);

        //Campo e label de CPF
        Label rotuloCpf = new Label("CPF: ");
        gridPane.add(rotuloCpf, 0, 3);

        TextField campoCpf = new TextField();
        campoCpf.setPrefHeight(35);
        gridPane.add(campoCpf, 1, 3);

        //Campo e label RG
        Label rotuloRg = new Label("RG: ");
        gridPane.add(rotuloRg,0,4 );

        TextField campoRg = new TextField();
        campoRg.setPrefHeight(35);
        gridPane.add(campoRg, 1, 4);

        //Campo e Label Idade
        Label rotuloIdade = new Label("Idade: ");
        gridPane.add(rotuloIdade, 0, 5);

        TextField campoIdade = new TextField();
        campoIdade.setPrefHeight(35);
        gridPane.add(campoIdade, 1, 5);

        //Seleção de genero
        Label rotuloGenero = new Label ("Genero: ");
        gridPane.add(rotuloGenero, 0, 6);
        ToggleButton maleButton = new ToggleButton("Mas");
        gridPane.add(maleButton, 1, 6);
        ToggleButton femaleButton = new ToggleButton("Fem");
        gridPane.add(femaleButton, 2, 6);

        //Selecao de quarto
        Label rotuloQuartos = new Label ("Quarto: ");
        gridPane.add(rotuloQuartos, 0, 7);
        String quartosVagos[] = { "Quarto 01", "Quarto 03", "Quarto 09",
                "Quarto 10", "Quarto 11" };
        ComboBox combo_box = new ComboBox(FXCollections.observableArrayList(quartosVagos));
        gridPane.add(combo_box, 1, 7);

        //Checkbox
        Label rotuloCheck = new Label ("Opção: ");
        gridPane.add(rotuloCheck, 0, 8);
        CheckBox cb = new CheckBox("Check-in");
        CheckBox cb2 = new CheckBox("Check-out");
        gridPane.add(cb, 1,8);
        gridPane.add(cb2, 2, 8);

        // Botões, na sequencia: Salvar, Buscar e Remover

        Button bt1 = new Button ("Salvar");
        Button bt2 = new Button ("Buscar");
        Button bt3 = new Button ("Remover");

        gridPane.add(bt1, 0, 9, 1, 1);
        gridPane.add(bt2, 1, 9, 1, 1);
        gridPane.add(bt3, 2, 9, 1, 1);


        bt1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(campoNome.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Erro", "Favor preencher seu nome.");
                    return;
                }
                if(campoEndereco.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Erro", "Favor preencher seu endereço.");
                    return;
                }
                if(campoCpf.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Errp", "Favor preencher seu CPF.");
                    return;
                }
                if(campoRg.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Erro", "Favor preencher seu RG.");
                }

                if(cb.isSelected()) {
                    showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(), "Finalizado", "Reserva feita! Obrigado, " + campoNome.getText());
                } else {
                    showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(), "Finalizado", "Check-out Realizado! Obrigado, " + campoNome.getText());
                }
            }
        });
    }

    private void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
