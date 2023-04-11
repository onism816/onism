package com.wzy.po;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class LendList implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_list.id
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_list.book_id
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    private Integer bookId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_list.reader_id
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    private Integer readerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_list.lend_date
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")//接收页面输入的时间，将其格式化
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")//后端传的日期格式化
    private Date lendDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_list.back_date
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date backDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_list.back_type
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    private Integer backType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_list.exceptRemarks
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    private String exceptRemarks;

    private BookInfo bookInfo;

    private ReaderInfo readerInfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lend_list
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_list.id
     *
     * @return the value of lend_list.id
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_list.id
     *
     * @param id the value for lend_list.id
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_list.book_id
     *
     * @return the value of lend_list.book_id
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_list.book_id
     *
     * @param bookId the value for lend_list.book_id
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_list.reader_id
     *
     * @return the value of lend_list.reader_id
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    public Integer getReaderId() {
        return readerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_list.reader_id
     *
     * @param readerId the value for lend_list.reader_id
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    public void setReaderId(Integer readerId) {
        this.readerId = readerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_list.lend_date
     *
     * @return the value of lend_list.lend_date
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    public Date getLendDate() {
        return lendDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_list.lend_date
     *
     * @param lendDate the value for lend_list.lend_date
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    public void setLendDate(Date lendDate) {
        this.lendDate = lendDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_list.back_date
     *
     * @return the value of lend_list.back_date
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    public Date getBackDate() {
        return backDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_list.back_date
     *
     * @param backDate the value for lend_list.back_date
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    public void setBackDate(Date backDate) {
        this.backDate = backDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_list.back_type
     *
     * @return the value of lend_list.back_type
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    public Integer getBackType() {
        return backType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_list.back_type
     *
     * @param backType the value for lend_list.back_type
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    public void setBackType(Integer backType) {
        this.backType = backType;
    }

    public String getExceptRemarks() {
        return exceptRemarks;
    }

    public void setExceptRemarks(String exceptRemarks) {
        this.exceptRemarks = exceptRemarks;
    }

    public BookInfo getBookInfo() {
        return bookInfo;
    }

    public void setBookInfo(BookInfo bookInfo) {
        this.bookInfo = bookInfo;
    }

    public ReaderInfo getReaderInfo() {
        return readerInfo;
    }

    public void setReaderInfo(ReaderInfo readerInfo) {
        this.readerInfo = readerInfo;
    }
}