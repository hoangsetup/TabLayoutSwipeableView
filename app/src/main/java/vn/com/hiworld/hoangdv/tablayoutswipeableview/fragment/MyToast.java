package vn.com.hiworld.hoangdv.tablayoutswipeableview.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import vn.com.hiworld.hoangdv.tablayoutswipeableview.R;

/**
 * Created by hoangdv on 24/06/2015.
 */
public class MyToast extends Toast implements View.OnClickListener {
    public MyToast(Context context, String msg) {
        super(context);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.toast_layout, null);
        TextView textView = (TextView)view.findViewById(R.id.textView_message);
        textView.setText(msg);
        setView(view);
        setDuration(LENGTH_SHORT);
        show();
    }

    @Override
    public void onClick(View view) {
        cancel();
    }
}
