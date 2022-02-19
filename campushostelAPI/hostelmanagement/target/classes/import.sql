INSERT INTO hostels_available(hostelid, hostelname, hostelcustodian, campus_id) VALUES
(1, "MAMLAKA", "MR.JOASH", "UON"),
(2, "HALL5", "MR.SIMON", "UON"),
(3,"HALL10", "MR.TIMON", "UON"),
(4,"HALL1", "MR.KUIO", "KU"),
(5, "HURLIBURTON", "MR.KURIA", "KU");

INSERT INTO campuses_available(campusid, campusname, campuscustodian, hostelid) VALUES
(1,"UON", "PROF.KINDIU"),
(2, "KU", "PROF.ARIRI");