

package cmput301.subbook;

//Import List
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * CustomerAdapter
 * Version 1.0
 * Copyright © 2018 CMPUT301, University of Alberta - All Rights Reserved.
 * You may use distribute or modify this code under terms and conditions of the code of Student Behaviour.
 * at University of Alberta.
 * @name: Shardul Shah
 * You can find a copy of the license in this project. Otherwise please contact shardul@ualberta.ca*
 * @date:  2/4/2018
 */

public class CustomAdapter extends BaseAdapter implements ListAdapter {
    private ArrayList<String> list= new ArrayList<String>();
    private Context context;

    /**
     * Class Constructor
     * @param list: an Arraylist type list used for storage of different subscriptions
     * @param context: what is the context? (usually, use: this)
     */

    public CustomAdapter(ArrayList<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    /**
     * @return: Returns size of list
     */
    @Override
    public int getCount() {
        return list.size();
    }

    /**
     * @param pos: what position in the list is the object desired at?
     * @return: returns the object itself
     */
    @Override
    public Object getItem(int pos) {
        return list.get(pos);
    }

    /**
     * @param position: what position in the list is the object desired at?
     * @param convertView: View type object; basically, the view that is desired.
     * @param parent: ViewGroup type variable; parent of view
     * @returns: returns desired view
     */

    /**
     * @param position: position of itemID
     * @returns: dummy value, only need function as it implements ListAdapter
     */
    @Override
    public long getItemId(int position)
    {
        return 0;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_rows, null);
        }

        //Handle TextView and display string from your list
        TextView listItemText = (TextView)view.findViewById(R.id.listText);
        listItemText.setText(list.get(position));

        //Handle buttons and add onClickListeners
        Button deleteBtn = (Button)view.findViewById(R.id.delete_btn);
        Button editBtn = (Button)view.findViewById(R.id.edit_btn);


        //working delete button which deletes a subscription when pressed
        deleteBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                list.remove(position); //or some other task
                notifyDataSetChanged();
            }
        });

        //edit button to be implemented here.
        editBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                notifyDataSetChanged();
            }
        });

        return view;
    }


}
//Source for some of code: https://github.com/codepath/android_guides/wiki/Using-a-BaseAdapter-with-ListView
