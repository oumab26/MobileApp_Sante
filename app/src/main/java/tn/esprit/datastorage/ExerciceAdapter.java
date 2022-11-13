package tn.esprit.datastorage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

import tn.esprit.datastorage.database.MyDatabase;

import tn.esprit.datastorage.entity.Exercice;

public class ExerciceAdapter extends RecyclerView.Adapter<ExerciceViewHolder> {

    List<Exercice> exerciceList;

    ExerciceAdapter(Context context) {
        MyDatabase db = MyDatabase.getDatabase(context);
        exerciceList = db.ExerciceDAO().findExercices();
    }

    @NonNull
    @Override
    public ExerciceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_article, parent, false);
        return new ExerciceViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciceViewHolder holder, int position) {
        Exercice exercice =  exerciceList.get(position);
        holder.name.setText(exercice.getName());

        holder.image.setBackgroundResource(exercice.getPicture());
        System.out.println(exercice.getPicture());
        //holder.price.setText(String.valueOf(exercice.getName()));


        holder.itemView.setOnClickListener(v -> {
            Toast.makeText(v.getContext(), exercice.getName() + " Clicked", Toast.LENGTH_SHORT).show();

        });

    }

    @Override
    public int getItemCount() {
        return  exerciceList.size();
    }


    public void addExercice(Exercice a) {
        exerciceList.add(a);
        notifyItemInserted( exerciceList.size() - 1);
    }
}
