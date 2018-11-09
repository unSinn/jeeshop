FROM airhacks/payara5
COPY ./target/jeeshop.war ${DEPLOYMENT_DIR}
