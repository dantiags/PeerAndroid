package com.aycron.peerandroid.model;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.aycron.peerandroid.R;

/**
 * Created by carlos.dantiags on 13/7/2016.
 */

public class MessagesAdapter extends ArrayAdapter<Message> {

    Context context;
    int layoutResourceId;
    Message[] messages = null;

    public MessagesAdapter(Context context, int resource, Message[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.layoutResourceId = resource;
        this.messages = objects;

    }

    public View getView(int position, View convertView, ViewGroup parent){
        View row = convertView;
        MessageHolder holder = null;

        if(row == null){

            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(this.layoutResourceId, parent, false);
            holder = new MessageHolder();
            holder.image = (ImageView) row.findViewById(R.id.lvimage);
            holder.text = (TextView) row.findViewById(R.id.lvtxt);
            holder.name = (TextView) row.findViewById(R.id.lvName);
            row.setTag(holder);
        }else{
            holder = (MessageHolder) row.getTag();
        }

        Message message = this.messages[position];
        holder.text.setText(message.message);
        holder.image.setImageResource(message.icon);
        holder.name.setText(message.name);

        return row;
    }

    static class MessageHolder {
        ImageView image;
        TextView text;
        TextView name;

    }
}
