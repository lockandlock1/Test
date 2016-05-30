package firstproject.vas.sk.com.test;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016-05-30.
 */
public class MyAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    List<String> items1 = new ArrayList<String>();
    List<String> items2 = new ArrayList<String>();
    public void add(String URL1,String URL2){
        items1.add(URL1);
        items2.add(URL2);
        notifyDataSetChanged();
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item,parent,false);

        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.setItem(items1.get(position),items2.get(position));
    }

    @Override
    public int getItemCount() {
        return items1.size();
    }
}
