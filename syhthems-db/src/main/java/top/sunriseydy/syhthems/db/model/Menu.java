package top.sunriseydy.syhthems.db.model;

import lombok.Data;
import top.sunriseydy.syhthems.db.enums.MenuTypeEnum;

import javax.persistence.*;

/**
 * @author SunriseYDY
 * Generated by MBG
 */
@Data
@Table(name = "`sys_menu`")
public class Menu extends BaseModel {
    /**
     * 菜单/按钮id
     */
    @Id
    @Column(name = "`menu_id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menuId;

    /**
     * 父菜单id,默认为0,即根菜单
     */
    @Column(name = "`parent_id`")
    private Long parentId;

    /**
     * 菜单/按钮代码
     */
    @Column(name = "`menu_code`")
    private String menuCode;

    /**
     * 菜单/按钮名称
     */
    @Column(name = "`menu_name`")
    private String menuName;

    /**
     * 菜单/按钮路径
     */
    @Column(name = "`path`")
    private String path;

    /**
     * 菜单的权限描述，默认为ROLE_USER,即用户角色
     */
    @Column(name = "`permission`")
    private String permission;

    /**
     * 菜单前端组件名称,只有菜单有，按钮无
     */
    @Column(name = "`menu_component`")
    private String menuComponent;

    /**
     * 菜单图标
     */
    @Column(name = "`icon`")
    private String icon;

    /**
     * 菜单的类型；0-菜单；1-按钮
     */
    @Column(name = "`type`")
    private MenuTypeEnum type;

    public static final String MENU_ID = "menuId";

    public static final String DB_MENU_ID = "menu_id";

    public static final String PARENT_ID = "parentId";

    public static final String DB_PARENT_ID = "parent_id";

    public static final String MENU_CODE = "menuCode";

    public static final String DB_MENU_CODE = "menu_code";

    public static final String MENU_NAME = "menuName";

    public static final String DB_MENU_NAME = "menu_name";

    public static final String PATH = "path";

    public static final String DB_PATH = "path";

    public static final String PERMISSION = "permission";

    public static final String DB_PERMISSION = "permission";

    public static final String MENU_COMPONENT = "menuComponent";

    public static final String DB_MENU_COMPONENT = "menu_component";

    public static final String ICON = "icon";

    public static final String DB_ICON = "icon";

    public static final String TYPE = "type";

    public static final String DB_TYPE = "type";

    public static final String CREATE_TIME = "createTime";

    public static final String DB_CREATE_TIME = "create_time";

    public static final String LAST_UPDATE_TIME = "lastUpdateTime";

    public static final String DB_LAST_UPDATE_TIME = "last_update_time";

    public static final String LAST_UPDATE_BY = "lastUpdateBy";

    public static final String DB_LAST_UPDATE_BY = "last_update_by";
}