package fun.platonic.pulsar.crawl.parse.html;

import fun.platonic.pulsar.common.config.ImmutableConfig;
import fun.platonic.pulsar.persist.WebPage;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * Created by vincent on 17-8-2.
 * Copyright @ 2013-2017 Platon AI. All rights reserved
 */
public class LinkExtractor {
    private ImmutableConfig conf;

    private String[] allow;
    private String[] deny;
    private String[] allowDomains;
    private String[] denyDomains;
    private String[] denyExtensions;
    private String[] restrictXPaths;
    private String[] restrictCss;
    private String[] tags = {"a", "area"};
    private String[] attrs = {"href"};
    private boolean canonicalize = false;
    private boolean unique = true;
    private Function processValue = null;
    private boolean strip = true;

    public LinkExtractor(ImmutableConfig conf) {
        this.conf = conf;
    }

    public LinkExtractor() {
    }

    public ArrayList<String> extract(WebPage page) {
        return new ArrayList<>();
    }
}
