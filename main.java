public class MainActivity extends AppCompatActivity {

    private TextView mResultTextView;
    private String mCurrentNumber;
    private String mLeftOperand;
    private String mRightOperand;
    private String mOperator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mResultTextView = findViewById(R.id.text_result);
        mCurrentNumber = "";
        mLeftOperand = "";
        mRightOperand = "";
        mOperator = "";

        findViewById(R.id.button_0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick("0");
            }
        });

        findViewById(R.id.button_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick("1");
            }
        });

        findViewById(R.id.button_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick("2");
            }
        });

        findViewById(R.id.button_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick("3");
            }
        });

        findViewById(R.id.button_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick("4");
            }
        });

        findViewById(R.id.button_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick("5");
            }
        });

        findViewById(R.id.button_6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick("6");
            }
        });

        findViewById(R.id.button_7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick("7");
            }
        });

        findViewById(R.id.button_8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick("8");
            }
        });

        findViewById(R.id.button_9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick("9");
            }
        });

        findViewById(R.id.button_decimal).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            onDecimalButtonClick(".");
        }
    });

    findViewById(R.id.button_add).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            onOperationButtonClick("+");
        }
    });

    findViewById(R.id.button_subtract).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            onOperationButtonClick("-");
        }
    });

    findViewById(R.id.button_multiply).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            onOperationButtonClick("*");
        }
    });

    findViewById(R.id.button_divide).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            onOperationButtonClick("/");
        }
    });

    findViewById(R.id.button_equals).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            onEqualsButtonClick();
        }
    });
}

private void onNumberButtonClick(String number) {
    mCurrentNumber += number;
    mResultTextView.setText(mCurrentNumber);
}

private void onDecimalButtonClick(String decimal) {
    if (!mCurrentNumber.contains(decimal)) {
        mCurrentNumber += decimal;
        mResultTextView.setText(mCurrentNumber);
    }
