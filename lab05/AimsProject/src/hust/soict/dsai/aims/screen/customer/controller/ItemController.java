package hust.soict.dsai.aims.screen.customer.controller;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

import javax.naming.LimitExceededException;

public class ItemController {
    private Cart cart = new Cart();
    private Media media;
    public ItemController(Cart cart) {
        this.cart = cart;
    }
    @FXML
    private Button btnAddToCart = new Button("Add to Cart");

    @FXML
    private Button btnPlay = new Button("Play");

    @FXML
    private Label lblTitle = new Label();

    @FXML
    private Label lblCost = new Label();

    @FXML
    void btnAddToCartClicked(ActionEvent event) throws LimitExceededException {
        cart.addMedia(media);

    }

    @FXML
    void btnPlayClicked(ActionEvent event) throws PlayerException {
        if(media instanceof Playable){
            ((Playable) media).play();
        }
    }

    public void setData(Media media) {
        this.media = media;

        lblTitle.setText(media.getTitle());
        lblCost.setText(media.getCost() + "$");
        if(media instanceof Playable){
            btnPlay.setVisible(true);
        }
        else {
            btnPlay.setVisible(false);
            HBox.setMargin(btnAddToCart, new Insets(0, 0, 0, 60));
        }
    }
}

