package ru.alekstereh.mynotes;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Date;

public class ContentFragment extends Fragment {

    private TextView title;
    private ImageView icon;

    public ContentFragment(){
        super(R.layout.fragment_content);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        icon = view.findViewById(R.id.icon);
        title = view.findViewById(R.id.title);

        icon.setOnClickListener(v -> {
            String curDate = new Date().toString();
            title.setText(curDate);
        });
    }
}
