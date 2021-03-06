package com.elliott.chenger.autosizingtextexampleproject.utils;

import com.omitneedlesscode.sizeadjustingtextview.SizeAdjustingTextView;

/**
 * Created by chenger on 5/26/14.
 */
public class TextMover {

    private TextMover() {
        throw new IllegalStateException("TextMover class");
    }

    public static void moveTextFromCellToCell(SizeAdjustingTextView startingCell,
        SizeAdjustingTextView endCell) {
        if (!startingCell.getText().toString().isEmpty()) {
            String text = startingCell.getText().toString();
            endCell.setText(text);
        }
    }

    public static void moveNewTextIntoCell(SizeAdjustingTextView targetCell,
        String text) {
        targetCell.setText(text);
    }
}
