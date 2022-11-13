package tn.esprit.datastorage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ExerciceViewHolder extends RecyclerView.ViewHolder {

    TextView name;
    TextView category;
    ImageView image;

    public ExerciceViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
        category = itemView.findViewById(R.id.category);
        image = itemView.findViewById(R.id.image);

    }
}
