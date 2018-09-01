package dao;

import entity.Report;


public interface ReportDAO extends BaseReport<Report>{
    Report getId();

    Report getnama();

    Report getkodematkul();

    Report getnamamatkul();

    Report getdosen();

    Report getjumlahsks();
}
