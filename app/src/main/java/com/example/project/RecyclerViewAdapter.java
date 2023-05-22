package com.example.project;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private List<Planet> planets;
    private LayoutInflater layoutInflater;
    private OnClickListener onClickListener;

    RecyclerViewAdapter(Context context, List<Planet> planets, OnClickListener onClickListener) {
        this.layoutInflater = LayoutInflater.from(context);
        this.planets = planets;
        this.onClickListener = onClickListener;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(layoutInflater.inflate(R.layout.recyclerview_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        holder.planetName.setText(planets.get(position).getName());
        holder.planetCircumference.setText(String.valueOf(planets.get(position).getSize()));
        holder.planetYear.setText(String.valueOf(planets.get(position).getCost()));

    }

    @Override
    public int getItemCount() {
        return planets.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView planetName;
        TextView planetCircumference;
        TextView planetYear;

        ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            planetName = itemView.findViewById(R.id.planetName);
            planetCircumference = itemView.findViewById(R.id.planetCircumference);
            planetYear = itemView.findViewById(R.id.planetYear);
        }

        @Override
        public void onClick(View view) {
            onClickListener.onClick(planets.get(getAdapterPosition()));
        }
    }

    public interface OnClickListener {
        void onClick(Planet item);
    }
}
