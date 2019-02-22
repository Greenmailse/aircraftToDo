package ru.aircr.todo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TodoItemsAdapter extends RecyclerView.Adapter<TodoItemsAdapter.TodoItemsViewHolder> {

    private static int viewHolderCount;
    private int numberItems;
    private String[] itemsData;

    public TodoItemsAdapter(int numberOfItems, String[] data) {
        numberItems = numberOfItems;
        viewHolderCount = 0;
        itemsData = data;
    }

    @NonNull
    @Override
    public TodoItemsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       Context context = viewGroup.getContext();
       int layoutIdForListItem = R.layout.todo_item;

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutIdForListItem, viewGroup, false);

        TodoItemsViewHolder viewHolder = new TodoItemsViewHolder(view);
        viewHolder.content.setText("ViewHolder index: "+viewHolderCount++);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TodoItemsViewHolder todoItemsViewHolder, int i) {
        todoItemsViewHolder.bind(i);
    }

    @Override
    public int getItemCount() {
        return numberItems;
    }

    class TodoItemsViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView content;

        public TodoItemsViewHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.item_title);
            content = itemView.findViewById(R.id.item_content);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    view.setLeft(80);
                    //view.setRight(60);
                }
            });

        }

        void bind(int listIndex) {
            title.setText(String.valueOf(itemsData[listIndex]));
        }
    }

}
