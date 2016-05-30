package firstproject.vas.sk.com.test;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Administrator on 2016-05-30.
 */
public class ItemViewHolder extends RecyclerView.ViewHolder {

    ImageView rectImage , circleImage;
    Context mContext;
    public ItemViewHolder(View itemView) {
        super(itemView);
        mContext = itemView.getContext();
        rectImage = (ImageView)itemView.findViewById(R.id.image_rect);
        circleImage = (ImageView)itemView.findViewById(R.id.image_circle);

    }


    public void setItem(String URL1 , String URL2){
        if(!TextUtils.isEmpty(URL1)){
            Glide.with(mContext)
                    .load(URL1)
                    .into(rectImage);


        }

        if(!TextUtils.isEmpty(URL2)){
            Glide.with(mContext)
                    .load(URL2)
                    .into(circleImage);
        }
    }


}
