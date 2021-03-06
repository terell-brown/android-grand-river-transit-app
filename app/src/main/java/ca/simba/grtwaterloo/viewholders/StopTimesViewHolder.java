package ca.simba.grtwaterloo.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import ca.simba.grtwaterloo.R;

/**
 * Contains and allows interaction with views in a single row showing bus stop times
 */
public class StopTimesViewHolder extends RecyclerView.ViewHolder {

    // UI
    private TextView tvStopTime;

    public StopTimesViewHolder(View row) {
        super(row);
        tvStopTime = (TextView) row.findViewById(R.id.tvStopTimes);
    }

    public void bindModel(String stopTimes) {
        tvStopTime.setText(stopTimes);
    }
}
