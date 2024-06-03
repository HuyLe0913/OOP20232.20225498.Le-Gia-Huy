package hust.soict.dsai.aims.screen.customer.controller;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.store.Store;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class CartController {
    private Cart cart = new Cart();
    private Store store = new Store();
    public CartController(Cart cart) {
        this.cart = cart;
    }
    public CartController(Store store, Cart cart) {
        this.cart = cart;
        this.store = store;
    }
    public CartController() {

    }

    @FXML
    private Button btnPlaceOrder;
    @FXML
    private TableColumn<Media, Integer> colMediaId;
    @FXML
    private RadioButton radioBtnFilterId;
    @FXML
    private TextField tfFilter;
    @FXML
    private RadioButton radioBtnFilterTitle;
    @FXML
    private Label costLabel;

    @FXML
    private TableView<Media> tblMedia;

    @FXML
    private TableColumn<Media, Float> colMediaCost;

    @FXML
    private ToggleGroup filterCategory;

    @FXML
    private Button btnRemove;

    @FXML
    private Button btnPlay;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediaCategory;

    @FXML
    void btnRemovePressed(ActionEvent event) {
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        cart.removeMedia(media);
        costLabel.setText(cart.totalCost(false) + "$");
    }
    @FXML
    void btnViewStorePressed(ActionEvent event) {
        try{
            final String CART_FXML_FILE_PATH = "/hust/soict/dsai/aims/screen/customer/view/Store.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(CART_FXML_FILE_PATH));
            fxmlLoader.setController(new ViewStoreController(store,cart));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Store");
            stage.show();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    @FXML
    void btnPlayPressed(ActionEvent event) throws PlayerException {
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        if(media instanceof Playable){
            ((Playable) media).play();
        }
    }

    @FXML
    public void initialize() {



        colMediaId.setCellValueFactory(new PropertyValueFactory<Media, Integer>("id"));
        colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
        colMediaCategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
        colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Float>("cost"));
        if(cart.getItemsOrdered() != null){
            tblMedia.setItems(cart.getItemsOrdered());
        }
        btnPlay.setVisible(false);
        btnRemove.setVisible(false);
        tblMedia.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Media>() {
            @Override
            public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue) {
                updateButtonBar(newValue);
            }
        });
        costLabel.setText(cart.totalCost(false) + "$");


    }
    @FXML
    void btnPlaceOrderPressed(ActionEvent event) {
        System.out.println("Thank for your purchase!");
        cart = new Cart();
        tblMedia.getItems().clear();

    }
    void updateButtonBar(Media media){
        if(media == null){
            btnPlay.setVisible(false);
            btnRemove.setVisible(false);
        }
        else{
            btnRemove.setVisible(true);
            if(media instanceof Playable){
                btnPlay.setVisible(true);
            }
            else{
                btnPlay.setVisible(false);
            }
        }
    }


}
