package tn.esprit.datastorage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.io.File;

import tn.esprit.datastorage.database.MyDatabase;

public class ExerciceViewHolder extends RecyclerView.ViewHolder {

    TextView name;
    TextView category;
    ImageView image;
    TextView description;

    public ExerciceViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
        category = itemView.findViewById(R.id.category);
        image = itemView.findViewById(R.id.image);
        description = itemView.findViewById(R.id.textdescription);

        MyDatabase db = MyDatabase.getDatabase(itemView.getContext());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),ExerciceDetailsActivity.class);
                i.putExtra("name",name.getText());
                i.putExtra("description",description.getText());
                i.putExtra("image",db.ExerciceDAO().get((String) name.getText()).getPicture());
                view.getContext().startActivity(i);
            }
        });
    }

}
