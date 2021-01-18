/*
 * Copyright (C) 2013-2016 Dominik Schürmann <dominik@schuermann.eu>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sufficientlysecure.htmltextview.example;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {
    public static final String EXTRA_TABLE_HTML = "EXTRA_TABLE_HTML";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_web_view);
        String tableHtml = getIntent().getStringExtra(EXTRA_TABLE_HTML);
        WebView webView = (WebView) findViewById(R.id.web_view);
        webView.loadData(tableHtml, "text/html", "UTF-8");
    }
}
