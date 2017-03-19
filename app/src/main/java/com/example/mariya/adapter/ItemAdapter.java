package com.example.mariya.adapter;;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

    public class ItemAdapter extends BaseAdapter {

        private Context context;
        private List<Item> items;

        public ItemAdapter(Context context, ArrayList<Item> items) {
            this.context = context;
            this.items = items;
        }

        @Override
        public int getCount() {
            return this.items.size();
        }

        @Override
        public Object getItem(int position) {
            return this.items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {

            View rowView = convertView;

            if (convertView == null) {
                // Create a new view into the list.
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                rowView = inflater.inflate(R.layout.list_item, parent, false);
            }

            /* ITEM */
            Item item = this.items.get(position);

            // findViewByIds
            ImageView ivItem = (ImageView) rowView.findViewById(R.id.ivItem);
            TextView tvTitle = (TextView) rowView.findViewById(R.id.tvTitle);
            TextView tvTitle1 = (TextView) rowView.findViewById(R.id.tvTitle1);

            ivItem.setImageResource(item.imagepicture);
            tvTitle.setText(item.id +  " " + item.name);
            tvTitle1.setText(item.color);

            return rowView;
        }
    }



