/*
 * Copyright 2011-2016 ZuoBian.com All right reserved. This software is the confidential and proprietary information of
 * ZuoBian.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with ZuoBian.com.
 */
package com.mmj.app.lucene.solr.service;

import java.util.List;

import com.mmj.app.common.result.Result;
import com.mmj.app.lucene.solr.callback.SolrCallback;

/**
 * 有版本号的Search方法
 * 
 * @author zxc Sep 2, 2014 1:44:07 PM
 */
public interface VersionableSearch<T, Q> {

    void indexWithOutDel(Integer version, List<T> fields);

    void indexWithOutDel(Integer version, T field);

    Result delAll(Integer version);

    Result del(Integer version, Q query);

    List<T> search(Integer version, Q query);

    List<T> search(Integer version, Q query, final SolrCallback callbacks);

    // String getCoreName(Integer version);
}
