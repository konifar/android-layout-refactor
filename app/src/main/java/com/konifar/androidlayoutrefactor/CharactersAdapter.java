package com.konifar.androidlayoutrefactor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class CharactersAdapter extends ArrayAdapter<Character> {

    public CharactersAdapter(Context context) {
        super(context, R.layout.item_character, new ArrayList<Character>());
    }

    @Override
    public View getView(int pos, View view, ViewGroup parent) {
        ViewHolder holder;

        if (view == null || view.getTag() == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.item_character, parent, false);
            holder = new ViewHolder(view);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        view.setTag(holder);
        bindData(holder, getItem(pos));
        return view;
    }

    private void bindData(ViewHolder holder, Character character) {
        holder.imgThumb.setImageDrawable(getContext().getResources().getDrawable(character.getDrawableResId()));
        holder.txtName.setText(character.getName());
        holder.txtPhrase.setText(character.getPhrase());
    }

    static class ViewHolder {
        @Bind(R.id.img_thumb)
        CircleImageView imgThumb;
        @Bind(R.id.txt_name)
        TextView txtName;
        @Bind(R.id.txt_phrase)
        TextView txtPhrase;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

}
