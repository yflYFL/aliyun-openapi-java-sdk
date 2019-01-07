/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeMetaListResponse;
import com.aliyuncs.rds.model.v20140815.DescribeMetaListResponse.Meta;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMetaListResponseUnmarshaller {

	public static DescribeMetaListResponse unmarshall(DescribeMetaListResponse describeMetaListResponse, UnmarshallerContext context) {
		
		describeMetaListResponse.setRequestId(context.stringValue("DescribeMetaListResponse.RequestId"));
		describeMetaListResponse.setDBInstanceName(context.stringValue("DescribeMetaListResponse.DBInstanceName"));
		describeMetaListResponse.setPageNumber(context.integerValue("DescribeMetaListResponse.PageNumber"));
		describeMetaListResponse.setPageRecordCount(context.integerValue("DescribeMetaListResponse.PageRecordCount"));
		describeMetaListResponse.setTotalRecordCount(context.integerValue("DescribeMetaListResponse.TotalRecordCount"));
		describeMetaListResponse.setTotalPageCount(context.integerValue("DescribeMetaListResponse.TotalPageCount"));

		List<Meta> items = new ArrayList<Meta>();
		for (int i = 0; i < context.lengthValue("DescribeMetaListResponse.Items.Length"); i++) {
			Meta meta = new Meta();
			meta.setDatabase(context.stringValue("DescribeMetaListResponse.Items["+ i +"].Database"));
			meta.setTables(context.stringValue("DescribeMetaListResponse.Items["+ i +"].Tables"));
			meta.setSize(context.stringValue("DescribeMetaListResponse.Items["+ i +"].Size"));

			items.add(meta);
		}
		describeMetaListResponse.setItems(items);
	 
	 	return describeMetaListResponse;
	}
}