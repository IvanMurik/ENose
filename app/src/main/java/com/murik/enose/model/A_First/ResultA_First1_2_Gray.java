package com.murik.enose.model.A_First;

import android.content.Context;

import com.murik.enose.R;
import com.murik.enose.dto.DataByMaxParcelable;
import com.murik.enose.model.resultbyMaxValue.BaseResult;

public class ResultA_First1_2_Gray extends BaseResult {


    public ResultA_First1_2_Gray(double A, DataByMaxParcelable inputData, Context context) {
        super(A, inputData, context);
        setLegend("1_2G");
    }

    public void setResult() {
       if (getA() > 0.11 && getA() < 0.25) {
            setColorGRAY();
            setPossibleReasons(getResources(R.string.A_SHORT_1_2_GREY_1));
        } else if (getA() >= 0.26 && getA() <= 0.38) {
            setColorGRAY();
            setPossibleReasons(getResources(R.string.A_SHORT_1_2_GREY_2));
        } else if (getA() >= 0.39 && getA() <= 0.40) {
            setColorGRAY();
            setPossibleReasons(getResources(R.string.A_SHORT_1_2_GREY_3));
        } else if (getA() >= 0.41 && getA() <= 0.60) {
            setColorGRAY();
            setPossibleReasons(getResources(R.string.A_SHORT_1_2_GREY_4));
        } else if (getA() >= 0.61 && getA() <= 0.70) {
            setColorGRAY();
            setPossibleReasons(getResources(R.string.A_SHORT_1_2_GREY_5));
        } else if (getA() >= 0.71 && getA() <= 0.80) {
            setColorGRAY();
            setPossibleReasons(getResources(R.string.A_SHORT_1_2_GREY_6));
        } else if (getA() >= 0.83 && getA() <= 0.88) {
            setColorGRAY();
            setPossibleReasons(getResources(R.string.A_SHORT_1_2_GREY_7));
        }
    }
}
