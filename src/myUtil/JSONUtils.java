package myUtil;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @Title: LeeJSONResult.java
 * @Package com.lee.utils
 * @Description: �Զ�����Ӧ���ݽṹ
 * 				��������ṩ���Ż���ios����׿��΢���̳��õ�
 * 				�Ż����ܴ������ݺ���Ҫʹ�ñ���ķ���ת���ɶ��ڵ��������͸�ʽ���࣬����list��
 * 				�������д���
 * 				200����ʾ�ɹ�
 * 				500����ʾ���󣬴�����Ϣ��msg�ֶ���
 * 				501��bean��֤���󣬲��ܶ��ٸ�������map��ʽ����
 * 				502�����������ص��û�token����
 * 				555���쳣�׳���Ϣ
 * Copyright: Copyright (c) 2016
 * Company:Nathan.Lee.Salvatore
 * 
 * @author leechenxiang
 * @date 2016��4��22�� ����8:33:36
 * @version V1.0
 */
public class JSONUtils {

    // ����jackson����
    private static final ObjectMapper MAPPER = new ObjectMapper();

    // ��Ӧҵ��״̬
    private Integer status;

    // ��Ӧ��Ϣ
    private String msg;

    // ��Ӧ�е�����
    private Object data;
    
    private String ok;	// ��ʹ��

    public static JSONUtils build(Integer status, String msg, Object data) {
        return new JSONUtils(status, msg, data);
    }

    public static JSONUtils ok(Object data) {
        return new JSONUtils(data);
    }

    public static JSONUtils ok() {
        return new JSONUtils(null);
    }
    
    public static JSONUtils errorMsg(String msg) {
        return new JSONUtils(500, msg, null);
    }
    
    public static JSONUtils errorMap(Object data) {
        return new JSONUtils(501, "error", data);
    }
    
    public static JSONUtils errorTokenMsg(String msg) {
        return new JSONUtils(502, msg, null);
    }
    
    public static JSONUtils errorException(String msg) {
        return new JSONUtils(555, msg, null);
    }

    public JSONUtils() {

    }

//    public static LeeJSONResult build(Integer status, String msg) {
//        return new LeeJSONResult(status, msg, null);
//    }
    /**
     * ���췽��
     * @param status ״̬
     * @param msg ��ӡ������Ϣ
     * @param data Json����
     */
    public JSONUtils(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public JSONUtils(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public Boolean isOK() {
        return this.status == 200;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 
     * @Description: ��json�����ת��ΪLeeJSONResult����
     * 				��Ҫת���Ķ�����һ����
     * @param jsonData
     * @param clazz
     * @return
     * 
     * @author leechenxiang
     * @date 2016��4��22�� ����8:34:58
     */
    public static JSONUtils formatToPojo(String jsonData, Class<?> clazz) {
        try {
            if (clazz == null) {
                return MAPPER.readValue(jsonData, JSONUtils.class);
            }
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (clazz != null) {
                if (data.isObject()) {
                    obj = MAPPER.readValue(data.traverse(), clazz);
                } else if (data.isTextual()) {
                    obj = MAPPER.readValue(data.asText(), clazz);
                }
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 
     * @Description: û��object�����ת��
     * @param json
     * @return
     * 
     * @author leechenxiang
     * @date 2016��4��22�� ����8:35:21
     */
    public static JSONUtils format(String json) {
        try {
            return MAPPER.readValue(json, JSONUtils.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 
     * @Description: Object�Ǽ���ת��
     * 				��Ҫת���Ķ�����һ��list
     * @param jsonData
     * @param clazz
     * @return
     * 
     * @author leechenxiang
     * @date 2016��4��22�� ����8:35:31
     */
    public static JSONUtils formatToList(String jsonData, Class<?> clazz) {
        try {
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (data.isArray() && data.size() > 0) {
                obj = MAPPER.readValue(data.traverse(),
                        MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

	public String getOk() {
		return ok;
	}

	public void setOk(String ok) {
		this.ok = ok;
	}

}
