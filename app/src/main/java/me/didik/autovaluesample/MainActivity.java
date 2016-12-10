package me.didik.autovaluesample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.didik.autovaluesample.model.Author;
import me.didik.autovaluesample.model.Book;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.et_first_name) EditText etFirstName;
    @BindView(R.id.et_last_name) EditText etLastName;
    @BindView(R.id.et_title) EditText etTitle;
    @BindView(R.id.et_published) EditText etPublished;
    @BindView(R.id.tv_text) TextView tvText;

    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        unbinder.unbind();
        super.onDestroy();
    }

    public void submit(View view) {
        String firstName = etFirstName.getText().toString();
        String lastName = etLastName.getText().toString();
        String title = etTitle.getText().toString();
        String published = etPublished.getText().toString();

        Author author = Author.create(firstName, lastName);
        Book book = Book.builder()
                .title(title)
                .published(published)
                .author(author)
                .build();

        tvText.append(book.toString() + "\n");
    }
}
