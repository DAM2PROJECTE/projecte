<?php 

	namespace App;

	class ErroresBD{
		public static function mensajeError($e)
		{
			$errorCode = $e->errorInfo[1];

			switch ($errorCode) {
				case 1062:
					$mensaje = "Registro duplicado";
					break;

				case 1451:
					$mensaje = "Registro como elementos relacionados";
					break;

				default:
					$mensaje = $e->errorInfo[1].' - '.$e->errorInfo[2];
					break;
			}

			return $mensaje;
		}
	}

?>