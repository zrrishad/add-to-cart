package com.example.addtocart;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainActivity extends AppCompatActivity {
    private Cart cart;
    private TextView productDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cart = new Cart();
        productDisplay = findViewById(R.id.productDisplay);
        Button addToCartButton = findViewById(R.id.addToCartButton);

        // Example product
        Product product = new Product("Sample Product", 29.99);
        productDisplay.setText("Product: " + product.getName() + ", Price: $" + product.getPrice());

        addToCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cart.addProduct(product);
                cart.viewCart(); // Display cart contents after adding
            }
        });
    }
}