package com.codingdm.mriya.aggregate;

import com.codingdm.mriya.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author wudongming
 * @email wdmcode@aliyun.com
 * @Date 6/8/2020 2:45 PM
 **/
@Slf4j
public class MergeMessageTest {

    @Test
    public void mergeTest(){
        String jsonString = "{\"data\":null,\"database\":\"mriya\",\"es\":1591173007000,\"id\":21,\"isDdl\":false,\"rowData\":[{\"data\":[{\"columnName\":\"t4\",\"columnValue\":\"2020-06-03\",\"type\":91},{\"columnName\":\"t5\",\"columnValue\":\"01:00:00\",\"type\":92},{\"columnName\":\"t6\",\"columnValue\":\"2020-06-03 09:27:28\",\"type\":93},{\"columnName\":\"t10\",\"columnValue\":\"15.0\",\"type\":3},{\"columnName\":\"t7\",\"columnValue\":\"2020-06-03 17:27:34\",\"type\":93},{\"columnName\":\"t8\",\"columnValue\":\"15.0\",\"type\":8},{\"columnName\":\"t9\",\"columnValue\":\"15\",\"type\":2005},{\"columnName\":\"id\",\"columnValue\":\"22\",\"type\":4},{\"columnName\":\"t1\",\"columnValue\":\"22\",\"type\":12},{\"columnName\":\"t2\",\"columnValue\":\"15\",\"type\":12},{\"columnName\":\"t3\",\"columnValue\":\"15.0\",\"type\":7}],\"pkValues\":null,\"pkValuesId\":\"canal224_mriya_table_t1_22\",\"type\":\"DELETE\"},{\"data\":[{\"columnName\":\"t4\",\"columnValue\":\"2020-06-03\",\"type\":91},{\"columnName\":\"t5\",\"columnValue\":\"01:00:00\",\"type\":92},{\"columnName\":\"t6\",\"columnValue\":\"2020-06-03 09:27:28\",\"type\":93},{\"columnName\":\"t10\",\"columnValue\":\"11.0\",\"type\":3},{\"columnName\":\"t7\",\"columnValue\":\"2020-06-03 17:27:34\",\"type\":93},{\"columnName\":\"t8\",\"columnValue\":\"11.0\",\"type\":8},{\"columnName\":\"t9\",\"columnValue\":\"11\",\"type\":2005},{\"columnName\":\"id\",\"columnValue\":\"11\",\"type\":4},{\"columnName\":\"t1\",\"columnValue\":\"11\",\"type\":12},{\"columnName\":\"t2\",\"columnValue\":\"11\",\"type\":12},{\"columnName\":\"t3\",\"columnValue\":\"11.0\",\"type\":7}],\"pkValues\":null,\"pkValuesId\":\"canal224_mriya_table_t1_11\",\"type\":\"DELETE\"},{\"data\":[{\"columnName\":\"t4\",\"columnValue\":\"2020-06-03\",\"type\":91},{\"columnName\":\"t5\",\"columnValue\":\"01:00:00\",\"type\":92},{\"columnName\":\"t6\",\"columnValue\":\"2020-06-03 09:27:28\",\"type\":93},{\"columnName\":\"t10\",\"columnValue\":\"14.0\",\"type\":3},{\"columnName\":\"t7\",\"columnValue\":\"2020-06-03 17:27:34\",\"type\":93},{\"columnName\":\"t8\",\"columnValue\":\"14.0\",\"type\":8},{\"columnName\":\"t9\",\"columnValue\":\"14\",\"type\":2005},{\"columnName\":\"id\",\"columnValue\":\"21\",\"type\":4},{\"columnName\":\"t1\",\"columnValue\":\"21\",\"type\":12},{\"columnName\":\"t2\",\"columnValue\":\"14\",\"type\":12},{\"columnName\":\"t3\",\"columnValue\":\"14.0\",\"type\":7}],\"pkValues\":null,\"pkValuesId\":\"canal224_mriya_table_t1_21\",\"type\":\"DELETE\"},{\"data\":[{\"columnName\":\"t4\",\"columnValue\":\"2020-06-03\",\"type\":91},{\"columnName\":\"t5\",\"columnValue\":\"01:00:00\",\"type\":92},{\"columnName\":\"t6\",\"columnValue\":\"2020-06-03 09:27:28\",\"type\":93},{\"columnName\":\"t10\",\"columnValue\":\"10.0\",\"type\":3},{\"columnName\":\"t7\",\"columnValue\":\"2020-06-03 17:27:34\",\"type\":93},{\"columnName\":\"t8\",\"columnValue\":\"10.0\",\"type\":8},{\"columnName\":\"t9\",\"columnValue\":\"10\",\"type\":2005},{\"columnName\":\"id\",\"columnValue\":\"10\",\"type\":4},{\"columnName\":\"t1\",\"columnValue\":\"10\",\"type\":12},{\"columnName\":\"t2\",\"columnValue\":\"10\",\"type\":12},{\"columnName\":\"t3\",\"columnValue\":\"10.0\",\"type\":7}],\"pkValues\":null,\"pkValuesId\":\"canal224_mriya_table_t1_10\",\"type\":\"DELETE\"},{\"data\":[{\"columnName\":\"t4\",\"columnValue\":\"2020-06-03\",\"type\":91},{\"columnName\":\"t5\",\"columnValue\":\"01:00:00\",\"type\":92},{\"columnName\":\"t6\",\"columnValue\":\"2020-06-03 09:27:28\",\"type\":93},{\"columnName\":\"t10\",\"columnValue\":\"13.0\",\"type\":3},{\"columnName\":\"t7\",\"columnValue\":\"2020-06-03 17:27:34\",\"type\":93},{\"columnName\":\"t8\",\"columnValue\":\"13.0\",\"type\":8},{\"columnName\":\"t9\",\"columnValue\":\"13\",\"type\":2005},{\"columnName\":\"id\",\"columnValue\":\"20\",\"type\":4},{\"columnName\":\"t1\",\"columnValue\":\"20\",\"type\":12},{\"columnName\":\"t2\",\"columnValue\":\"13\",\"type\":12},{\"columnName\":\"t3\",\"columnValue\":\"13.0\",\"type\":7}],\"pkValues\":null,\"pkValuesId\":\"canal224_mriya_table_t1_20\",\"type\":\"DELETE\"},{\"data\":[{\"columnName\":\"t4\",\"columnValue\":\"2020-06-03\",\"type\":91},{\"columnName\":\"t5\",\"columnValue\":\"01:00:00\",\"type\":92},{\"columnName\":\"t6\",\"columnValue\":\"2020-06-03 09:27:28\",\"type\":93},{\"columnName\":\"t10\",\"columnValue\":\"19.0\",\"type\":3},{\"columnName\":\"t7\",\"columnValue\":\"2020-06-03 17:27:34\",\"type\":93},{\"columnName\":\"t8\",\"columnValue\":\"19.0\",\"type\":8},{\"columnName\":\"t9\",\"columnValue\":\"19\",\"type\":2005},{\"columnName\":\"id\",\"columnValue\":\"26\",\"type\":4},{\"columnName\":\"t1\",\"columnValue\":\"26\",\"type\":12},{\"columnName\":\"t2\",\"columnValue\":\"19\",\"type\":12},{\"columnName\":\"t3\",\"columnValue\":\"19.0\",\"type\":7}],\"pkValues\":null,\"pkValuesId\":\"canal224_mriya_table_t1_26\",\"type\":\"DELETE\"},{\"data\":[{\"columnName\":\"t4\",\"columnValue\":\"2020-06-03\",\"type\":91},{\"columnName\":\"t5\",\"columnValue\":\"01:00:00\",\"type\":92},{\"columnName\":\"t6\",\"columnValue\":\"2020-06-03 09:27:28\",\"type\":93},{\"columnName\":\"t10\",\"columnValue\":\"14.0\",\"type\":3},{\"columnName\":\"t7\",\"columnValue\":\"2020-06-03 17:27:34\",\"type\":93},{\"columnName\":\"t8\",\"columnValue\":\"14.0\",\"type\":8},{\"columnName\":\"t9\",\"columnValue\":\"14\",\"type\":2005},{\"columnName\":\"id\",\"columnValue\":\"14\",\"type\":4},{\"columnName\":\"t1\",\"columnValue\":\"14\",\"type\":12},{\"columnName\":\"t2\",\"columnValue\":\"14\",\"type\":12},{\"columnName\":\"t3\",\"columnValue\":\"14.0\",\"type\":7}],\"pkValues\":null,\"pkValuesId\":\"canal224_mriya_table_t1_14\",\"type\":\"DELETE\"},{\"data\":[{\"columnName\":\"t4\",\"columnValue\":\"2020-06-03\",\"type\":91},{\"columnName\":\"t5\",\"columnValue\":\"01:00:00\",\"type\":92},{\"columnName\":\"t6\",\"columnValue\":\"2020-06-03 09:27:28\",\"type\":93},{\"columnName\":\"t10\",\"columnValue\":\"18.0\",\"type\":3},{\"columnName\":\"t7\",\"columnValue\":\"2020-06-03 17:27:34\",\"type\":93},{\"columnName\":\"t8\",\"columnValue\":\"18.0\",\"type\":8},{\"columnName\":\"t9\",\"columnValue\":\"18\",\"type\":2005},{\"columnName\":\"id\",\"columnValue\":\"25\",\"type\":4},{\"columnName\":\"t1\",\"columnValue\":\"25\",\"type\":12},{\"columnName\":\"t2\",\"columnValue\":\"18\",\"type\":12},{\"columnName\":\"t3\",\"columnValue\":\"18.0\",\"type\":7}],\"pkValues\":null,\"pkValuesId\":\"canal224_mriya_table_t1_25\",\"type\":\"DELETE\"},{\"data\":[{\"columnName\":\"t4\",\"columnValue\":\"2020-06-03\",\"type\":91},{\"columnName\":\"t5\",\"columnValue\":\"01:00:00\",\"type\":92},{\"columnName\":\"t6\",\"columnValue\":\"2020-06-03 09:27:28\",\"type\":93},{\"columnName\":\"t10\",\"columnValue\":\"17.0\",\"type\":3},{\"columnName\":\"t7\",\"columnValue\":\"2020-06-03 17:27:34\",\"type\":93},{\"columnName\":\"t8\",\"columnValue\":\"17.0\",\"type\":8},{\"columnName\":\"t9\",\"columnValue\":\"17\",\"type\":2005},{\"columnName\":\"id\",\"columnValue\":\"24\",\"type\":4},{\"columnName\":\"t1\",\"columnValue\":\"24\",\"type\":12},{\"columnName\":\"t2\",\"columnValue\":\"17\",\"type\":12},{\"columnName\":\"t3\",\"columnValue\":\"17.0\",\"type\":7}],\"pkValues\":null,\"pkValuesId\":\"canal224_mriya_table_t1_24\",\"type\":\"DELETE\"},{\"data\":[{\"columnName\":\"t4\",\"columnValue\":\"2020-06-03\",\"type\":91},{\"columnName\":\"t5\",\"columnValue\":\"01:00:00\",\"type\":92},{\"columnName\":\"t6\",\"columnValue\":\"2020-06-03 09:27:28\",\"type\":93},{\"columnName\":\"t10\",\"columnValue\":\"16.0\",\"type\":3},{\"columnName\":\"t7\",\"columnValue\":\"2020-06-03 17:27:34\",\"type\":93},{\"columnName\":\"t8\",\"columnValue\":\"16.0\",\"type\":8},{\"columnName\":\"t9\",\"columnValue\":\"16\",\"type\":2005},{\"columnName\":\"id\",\"columnValue\":\"23\",\"type\":4},{\"columnName\":\"t1\",\"columnValue\":\"23\",\"type\":12},{\"columnName\":\"t2\",\"columnValue\":\"16\",\"type\":12},{\"columnName\":\"t3\",\"columnValue\":\"16.0\",\"type\":7}],\"pkValues\":null,\"pkValuesId\":\"canal224_mriya_table_t1_23\",\"type\":\"DELETE\"},{\"data\":[{\"columnName\":\"t4\",\"columnValue\":\"2020-06-03\",\"type\":91},{\"columnName\":\"t5\",\"columnValue\":\"01:00:00\",\"type\":92},{\"columnName\":\"t6\",\"columnValue\":\"2020-06-03 09:27:28\",\"type\":93},{\"columnName\":\"t10\",\"columnValue\":\"12.0\",\"type\":3},{\"columnName\":\"t7\",\"columnValue\":\"2020-06-03 17:27:34\",\"type\":93},{\"columnName\":\"t8\",\"columnValue\":\"12.0\",\"type\":8},{\"columnName\":\"t9\",\"columnValue\":\"12\",\"type\":2005},{\"columnName\":\"id\",\"columnValue\":\"12\",\"type\":4},{\"columnName\":\"t1\",\"columnValue\":\"12\",\"type\":12},{\"columnName\":\"t2\",\"columnValue\":\"12\",\"type\":12},{\"columnName\":\"t3\",\"columnValue\":\"12.0\",\"type\":7}],\"pkValues\":null,\"pkValuesId\":\"canal224_mriya_table_t1_12\",\"type\":\"DELETE\"},{\"data\":[{\"columnName\":\"t4\",\"columnValue\":\"2020-06-03\",\"type\":91},{\"columnName\":\"t5\",\"columnValue\":\"01:00:00\",\"type\":92},{\"columnName\":\"t6\",\"columnValue\":\"2020-06-03 09:27:28\",\"type\":93},{\"columnName\":\"t10\",\"columnValue\":\"9.0\",\"type\":3},{\"columnName\":\"t7\",\"columnValue\":\"2020-06-03 17:27:34\",\"type\":93},{\"columnName\":\"t8\",\"columnValue\":\"9.0\",\"type\":8},{\"columnName\":\"t9\",\"columnValue\":\"9\",\"type\":2005},{\"columnName\":\"id\",\"columnValue\":\"9\",\"type\":4},{\"columnName\":\"t1\",\"columnValue\":\"9\",\"type\":12},{\"columnName\":\"t2\",\"columnValue\":\"9\",\"type\":12},{\"columnName\":\"t3\",\"columnValue\":\"9.0\",\"type\":7}],\"pkValues\":null,\"pkValuesId\":\"canal224_mriya_table_t1_9\",\"type\":\"DELETE\"},{\"data\":[{\"columnName\":\"t4\",\"columnValue\":\"2020-06-03\",\"type\":91},{\"columnName\":\"t5\",\"columnValue\":\"01:00:00\",\"type\":92},{\"columnName\":\"t6\",\"columnValue\":\"2020-06-03 09:27:28\",\"type\":93},{\"columnName\":\"t10\",\"columnValue\":\"7.0\",\"type\":3},{\"columnName\":\"t7\",\"columnValue\":\"2020-06-03 17:27:34\",\"type\":93},{\"columnName\":\"t8\",\"columnValue\":\"7.0\",\"type\":8},{\"columnName\":\"t9\",\"columnValue\":\"7\",\"type\":2005},{\"columnName\":\"id\",\"columnValue\":\"7\",\"type\":4},{\"columnName\":\"t1\",\"columnValue\":\"7\",\"type\":12},{\"columnName\":\"t2\",\"columnValue\":\"7\",\"type\":12},{\"columnName\":\"t3\",\"columnValue\":\"7.0\",\"type\":7}],\"pkValues\":null,\"pkValuesId\":\"canal224_mriya_table_t1_7\",\"type\":\"DELETE\"},{\"data\":[{\"columnName\":\"t4\",\"columnValue\":\"2020-06-03\",\"type\":91},{\"columnName\":\"t5\",\"columnValue\":\"01:00:00\",\"type\":92},{\"columnName\":\"t6\",\"columnValue\":\"2020-06-03 09:27:28\",\"type\":93},{\"columnName\":\"t10\",\"columnValue\":\"8.0\",\"type\":3},{\"columnName\":\"t7\",\"columnValue\":\"2020-06-03 17:27:34\",\"type\":93},{\"columnName\":\"t8\",\"columnValue\":\"8.0\",\"type\":8},{\"columnName\":\"t9\",\"columnValue\":\"8\",\"type\":2005},{\"columnName\":\"id\",\"columnValue\":\"8\",\"type\":4},{\"columnName\":\"t1\",\"columnValue\":\"8\",\"type\":12},{\"columnName\":\"t2\",\"columnValue\":\"8\",\"type\":12},{\"columnName\":\"t3\",\"columnValue\":\"8.0\",\"type\":7}],\"pkValues\":null,\"pkValuesId\":\"canal224_mriya_table_t1_8\",\"type\":\"DELETE\"},{\"data\":[{\"columnName\":\"t4\",\"columnValue\":\"2020-06-03\",\"type\":91},{\"columnName\":\"t5\",\"columnValue\":\"01:00:00\",\"type\":92},{\"columnName\":\"t6\",\"columnValue\":\"2020-06-03 09:27:28\",\"type\":93},{\"columnName\":\"t10\",\"columnValue\":\"5.0\",\"type\":3},{\"columnName\":\"t7\",\"columnValue\":\"2020-06-03 17:27:34\",\"type\":93},{\"columnName\":\"t8\",\"columnValue\":\"5.0\",\"type\":8},{\"columnName\":\"t9\",\"columnValue\":\"5\",\"type\":2005},{\"columnName\":\"id\",\"columnValue\":\"5\",\"type\":4},{\"columnName\":\"t1\",\"columnValue\":\"5\",\"type\":12},{\"columnName\":\"t2\",\"columnValue\":\"5\",\"type\":12},{\"columnName\":\"t3\",\"columnValue\":\"5.0\",\"type\":7}],\"pkValues\":null,\"pkValuesId\":\"canal224_mriya_table_t1_5\",\"type\":\"DELETE\"},{\"data\":[{\"columnName\":\"t4\",\"columnValue\":\"2020-06-03\",\"type\":91},{\"columnName\":\"t5\",\"columnValue\":\"01:00:00\",\"type\":92},{\"columnName\":\"t6\",\"columnValue\":\"2020-06-03 09:27:28\",\"type\":93},{\"columnName\":\"t10\",\"columnValue\":\"6.0\",\"type\":3},{\"columnName\":\"t7\",\"columnValue\":\"2020-06-03 17:27:34\",\"type\":93},{\"columnName\":\"t8\",\"columnValue\":\"6.0\",\"type\":8},{\"columnName\":\"t9\",\"columnValue\":\"6\",\"type\":2005},{\"columnName\":\"id\",\"columnValue\":\"6\",\"type\":4},{\"columnName\":\"t1\",\"columnValue\":\"6\",\"type\":12},{\"columnName\":\"t2\",\"columnValue\":\"6\",\"type\":12},{\"columnName\":\"t3\",\"columnValue\":\"6.0\",\"type\":7}],\"pkValues\":null,\"pkValuesId\":\"canal224_mriya_table_t1_6\",\"type\":\"DELETE\"},{\"data\":[{\"columnName\":\"t4\",\"columnValue\":\"2020-06-03\",\"type\":91},{\"columnName\":\"t5\",\"columnValue\":\"01:00:00\",\"type\":92},{\"columnName\":\"t6\",\"columnValue\":\"2020-06-03 09:27:28\",\"type\":93},{\"columnName\":\"t10\",\"columnValue\":\"3.0\",\"type\":3},{\"columnName\":\"t7\",\"columnValue\":\"2020-06-03 17:27:34\",\"type\":93},{\"columnName\":\"t8\",\"columnValue\":\"3.0\",\"type\":8},{\"columnName\":\"t9\",\"columnValue\":\"3\",\"type\":2005},{\"columnName\":\"id\",\"columnValue\":\"3\",\"type\":4},{\"columnName\":\"t1\",\"columnValue\":\"3\",\"type\":12},{\"columnName\":\"t2\",\"columnValue\":\"3\",\"type\":12},{\"columnName\":\"t3\",\"columnValue\":\"3.0\",\"type\":7}],\"pkValues\":null,\"pkValuesId\":\"canal224_mriya_table_t1_3\",\"type\":\"DELETE\"},{\"data\":[{\"columnName\":\"t4\",\"columnValue\":\"2020-06-03\",\"type\":91},{\"columnName\":\"t5\",\"columnValue\":\"01:00:00\",\"type\":92},{\"columnName\":\"t6\",\"columnValue\":\"2020-06-03 09:27:28\",\"type\":93},{\"columnName\":\"t10\",\"columnValue\":\"4.0\",\"type\":3},{\"columnName\":\"t7\",\"columnValue\":\"2020-06-03 17:27:34\",\"type\":93},{\"columnName\":\"t8\",\"columnValue\":\"4.0\",\"type\":8},{\"columnName\":\"t9\",\"columnValue\":\"4\",\"type\":2005},{\"columnName\":\"id\",\"columnValue\":\"4\",\"type\":4},{\"columnName\":\"t1\",\"columnValue\":\"4\",\"type\":12},{\"columnName\":\"t2\",\"columnValue\":\"4\",\"type\":12},{\"columnName\":\"t3\",\"columnValue\":\"4.0\",\"type\":7}],\"pkValues\":null,\"pkValuesId\":\"canal224_mriya_table_t1_4\",\"type\":\"DELETE\"},{\"data\":[{\"columnName\":\"t4\",\"columnValue\":\"2020-06-03\",\"type\":91},{\"columnName\":\"t5\",\"columnValue\":\"01:00:00\",\"type\":92},{\"columnName\":\"t6\",\"columnValue\":\"2020-06-03 09:27:28\",\"type\":93},{\"columnName\":\"t10\",\"columnValue\":\"1.0\",\"type\":3},{\"columnName\":\"t7\",\"columnValue\":\"2020-06-03 17:27:34\",\"type\":93},{\"columnName\":\"t8\",\"columnValue\":\"1.0\",\"type\":8},{\"columnName\":\"t9\",\"columnValue\":\"1\",\"type\":2005},{\"columnName\":\"id\",\"columnValue\":\"1\",\"type\":4},{\"columnName\":\"t1\",\"columnValue\":\"1\",\"type\":12},{\"columnName\":\"t2\",\"columnValue\":\"1\",\"type\":12},{\"columnName\":\"t3\",\"columnValue\":\"1.0\",\"type\":7}],\"pkValues\":null,\"pkValuesId\":\"canal224_mriya_table_t1_1\",\"type\":\"DELETE\"},{\"data\":[{\"columnName\":\"t4\",\"columnValue\":\"2020-06-03\",\"type\":91},{\"columnName\":\"t5\",\"columnValue\":\"01:00:00\",\"type\":92},{\"columnName\":\"t6\",\"columnValue\":\"2020-06-03 09:27:28\",\"type\":93},{\"columnName\":\"t10\",\"columnValue\":\"2.0\",\"type\":3},{\"columnName\":\"t7\",\"columnValue\":\"2020-06-03 17:27:34\",\"type\":93},{\"columnName\":\"t8\",\"columnValue\":\"2.0\",\"type\":8},{\"columnName\":\"t9\",\"columnValue\":\"2\",\"type\":2005},{\"columnName\":\"id\",\"columnValue\":\"2\",\"type\":4},{\"columnName\":\"t1\",\"columnValue\":\"2\",\"type\":12},{\"columnName\":\"t2\",\"columnValue\":\"2\",\"type\":12},{\"columnName\":\"t3\",\"columnValue\":\"2.0\",\"type\":7}],\"pkValues\":null,\"pkValuesId\":\"canal224_mriya_table_t1_2\",\"type\":\"DELETE\"}],\"mysqlType\":{\"t4\":\"date\",\"t5\":\"time\",\"t6\":\"datetime\",\"t10\":\"decimal(10,3)\",\"t7\":\"timestamp\",\"t8\":\"double\",\"t9\":\"text\",\"id\":\"int(255)\",\"t1\":\"varchar(100)\",\"t2\":\"varchar(200)\",\"t3\":\"float\"},\"old\":null,\"pkNames\":[\"id\", \"t1\"],\"sql\":\"\",\"sqlType\":{\"t4\":91,\"t5\":92,\"t6\":93,\"t10\":3,\"t7\":93,\"t8\":8,\"t9\":2005,\"id\":4,\"t1\":12,\"t2\":12,\"t3\":7},\"table\":\"table_t1\",\"targetTable\":\"canal224_mriya_table_t1\",\"topic\":\"canal224\",\"ts\":1591173007948,\"type\":\"DELETE\"}";


        Message message = Message.buildMessage(jsonString, "topic");
        message.getRowData().forEach(merge->{
            merge.getData().forEach(System.out::println);
        });
    }

}
