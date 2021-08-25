package my.edu.tarc.myrecycleviewritg4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import my.edu.tarc.myrecycleviewritg4.data.MyAdapter
import my.edu.tarc.myrecycleviewritg4.data.Product

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val productList = listOf<Product>(
            Product("pen",2.50,R.drawable.ic_baseline_architecture_24),
            Product("Computer",2500.00,R.drawable.ic_baseline_architecture_24),
            Product("Book",12.50,R.drawable.ic_baseline_architecture_24),
            Product("Keyboard",20.00,R.drawable.ic_baseline_architecture_24),
            Product("Pencil", 2.50,R.drawable.ic_baseline_architecture_24)
        )

        val recyclerView : RecyclerView = findViewById(R.id.productRecycleView)
        recyclerView.adapter = MyAdapter(productList)
        recyclerView.setHasFixedSize(true)

    }
}