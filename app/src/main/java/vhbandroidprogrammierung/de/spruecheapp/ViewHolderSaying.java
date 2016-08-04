package vhbandroidprogrammierung.de.spruecheapp;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolderSaying extends ViewHolder implements View.OnClickListener {

    private static final String TAG = "ViewHolderReminder";
    private CardView cardView;
    private TextView tv_saying, tv_author, tv_category;
    private ImageView iv_favorite, iv_user_saying;
    private Context context;
    private View view;

    public ViewHolderSaying(Context context, View view) {
        super(view);

        this.view = view;
        this.context = context;

        cardView = (CardView) this.view.findViewById(R.id.cardview);

        tv_saying = (TextView) this.view.findViewById(R.id.tv_saying);
        tv_author = (TextView) this.view.findViewById(R.id.tv_author);
        tv_category = (TextView) this.view.findViewById(R.id.tv_category);

        iv_favorite = (ImageView) this.view.findViewById(R.id.iv_star);
        //iv_user_saying = (ImageView) this.view.findViewById(R.id.iv_user);

        iv_favorite.setOnClickListener(this);
       // iv_user_saying.setOnClickListener(this);
    }

    /**
     * Providing the content for the Views from the Saying Items
     *
     * @param item ListItem to ask for content
     */
    public void bindType(ListItemSaying item) {

        String saying = ((Saying) item).getSaying();
        String author = ((Saying) item).getAuthor();
        String category = ((Saying) item).getCategory();

        boolean isFavorite = ((Saying) item).isFavorite();
        boolean isUserSaying = ((Saying) item).isUserSaying();

        tv_saying.setText(saying);
        tv_author.setText(author);
        tv_category.setText(category);

        if(isFavorite) {
            //TODO/ Filled star Image
        }
    }


    /**
     * Clicking on the anywhere triggers a dialog to change title and reminder.
     * Clicking the switch activates or deactivates the card.
     *
     * @param v The View that has been clicked
     */
    @Override
    public void onClick(View v) {

        int apaterPosition = getAdapterPosition();

        switch (v.getId()) {

            case R.id.iv_star:
                callHome(apaterPosition, cardView);
                break;

            default:
                break;
        }
    }

    /**
     * Calling MainActivity from onClick
     *
     * @param pos
     * @param cv
     */
    public void callHome(int pos, CardView cv) {
        ((MainActivity) context).favStarHasBeenClicked(pos, cv);
    }
}