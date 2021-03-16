create table  IF NOT EXISTS `user` (
   `id`                   bigint not null auto_increment comment 'id',
   `username`            varchar(64) comment '用户名',
   `password`             varchar(50) comment '密码',
   `birthday` date DEFAULT NULL COMMENT '生日',
   `gender` int(1) DEFAULT NULL COMMENT '性别：0->未知；1->男；2->女',
    primary key (`id`)
)ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='用户表';


create table  IF NOT EXISTS `emp` (
   `id`                   bigint not null auto_increment comment 'id',
   `user_id`              bigint not null  comment '用户id',
   `emp_name`            varchar(64) comment '员工姓名',
   `password`             varchar(50) comment '密码',
   `birthday` date DEFAULT NULL COMMENT '生日',
   `gender` int(1) DEFAULT NULL COMMENT '性别：0->未知；1->男；2->女',
    primary key (`id`)
)ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='员工表';